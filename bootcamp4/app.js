var express = require('express');

// create express app
var app = express();

// serve static files
app.use(express.static(__dirname));

app.listen(9999);
console.log('Web server listening on port 9999');
