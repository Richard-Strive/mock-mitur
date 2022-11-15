const express = require("express");
const admz = require('adm-zip')
const fs = require('fs');
const route = express.Router();
var AWS = require('aws-sdk');

var s3 = new AWS.S3();
// PERSONAL PROFILE INFOS
route.get("/csv", (req, res) => {
  try {
  

var myBucket = 'mitur';



s3.createBucket({Bucket: myBucket}, function(err, data) {
  var to_zip = fs.readdirSync(__dirname+'/'+'upload_data')
  // res.sendFile(__dirname+'/upload_data/'+'sample.csv')
  var zp = new admz();
  for(var k=0 ; k<to_zip.length ; k++){
    zp.addLocalFile(__dirname+'/'+'upload_data'+'/'+to_zip[k])
}
  // here we assigned the name to our downloaded file!
  const file_after_download = 'the_fork_sample_file.zip';

  // toBuffer() is used to read the data and save it
  // for downloading process!
  const csv = zp.toBuffer();
  var Key = file_after_download;
 // I nomi dei bucket devono essere univoci per tutti gli utenti S3

if (err) {

   console.log(err);

   } else {

     params = {Bucket: myBucket, Key,Body: csv};

     s3.putObject(params, function(err, data) {

         if (err) {

             console.log(err)

         } else {
            //  console.log(data)
             res.send(data);
             console.log("Successfully uploaded data to myBucket/myKey");

         }

      });

   }

});   
  
    // this is the code for downloading!
    // here we have to specify 3 things:
        // 1. type of content that we are downloading
        // 2. name of file to be downloaded
        // 3. length or size of the downloaded file!
  
    // res.set('Content-Type','application/octet-stream');
    // res.set('Content-Disposition',`attachment; filename=${file_after_download}`);
    // res.set('Content-Length',data.length);
    
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
