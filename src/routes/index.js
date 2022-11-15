const express = require("express");
const JSZip = require('jszip');
const fs = require('fs');
const route = express.Router();

// PERSONAL PROFILE INFOS
route.get("/csv", (req, res) => {
  try {
    const csvData = fs.readFileSync('sample.csv');

    zip.file("CSVFile.csv", csvData);

    zip.generateNodeStream({ type: 'nodebuffer', streamFiles: true })
        .pipe(fs.createWriteStream('sample.zip'))
        .on('finish', function () {
            console.log("sample.zip written.");
        });

    const data = zip.toBuffer();

    const file_after_download = 'the_forksample.zip';

    res.set('Content-Type','application/octet-stream');
    res.set('Content-Disposition',`attachment; filename=${file_after_download}`);
    res.set('Content-Length',data.length);
    res.send(data);
} catch (err) {
    console.error(err)
}
});

// route.get("/search/city/:city", (req, res) => {
//   try {
//     const products = getHistoryPurchase();
//    console.log(req.params.city) 

//  const finalProd= products.filter(product => product.localtion.toUpperCase() == req.params.city.toUpperCase() )

//     res.status(200).send(finalProd);
//   } catch (error) {
//     console.log(error);
//   }
// });

/*route.get("/search", (req, res) => {
  try {
    const product = getHistoryPurchase();
    console.log("This is the product--->",product)
    res.status(200).send(product);
  } catch (error) {
    console.log(error);
  }
});*/

//Server mock-be
//https://mock-be.herokuapp.com/

module.exports = route;
