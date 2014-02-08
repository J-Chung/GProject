/**
 * Created by John on 14-2-8.
 */
var queryString = require("query"+"string");

function start(response, postData) {
    console.log("Request handle 'start' was called");

    var body =
            '<html>'+
            '<head>'+
            '<meta http-equiv="Content-Type" content="text/html; '+ 'charset=UTF-8" />'+
            '</head>'+
            '<body>'+
            '<form action="/upload" method="post">'+
            '<textarea name="text" rows="20" cols="60"></textarea><br />'+
            '<input type="submit" value="Submit text" />'+
            '</form>'+
            '</body>'+
            '</html>';


    response.writeHeader(200,{"Content-Type":"text/html"});
            response.write(body);
            response.end();

}
function upload(response, postData) {
    console.log("Request handle 'upload' was called");
    response.writeHeader(200,{"Content-Type":"text/plain"});
    response.write("You've sent : "+ queryString.parse(postData).text);
    response.end();
}
exports.start = start;
exports.upload = upload;