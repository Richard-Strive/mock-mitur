const express = require("express");
const route = express.Router();
var AWS = require('aws-sdk');
var request = require('request');

const file_after_download = 'the_fork_sample_file7.zip'; 
const myBucket = 'mitur';
const url='https://young-springs-08364.herokuapp.com/csv'

var s3 = new AWS.S3({params: {Bucket: myBucket, Key: file_after_download}});

route.get("/csv", async(req, res) => {
  try {
     
      request.get(url).on('response', function (response) {
        if (200 == response.statusCode) {
          s3.upload({Body: response}, function (err, data) {  //2 months
             console.log(err,data);
          if(err){
            res.send(err)
            console.log(err)
          }else{
            res.send(data)
          }
        });
      }
    });

} catch (err) {
    console.error(err)
}
});


module.exports = route;
