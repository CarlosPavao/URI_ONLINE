var input = require('fs').readFileSync('./GITHUB/URI_ONLINE/JavaScript/dev/stdin/file.txt','utf-8')
var lines = input.split('\n');

var p1 = 3.14159
var r = lines.shift()
var area = p1*(r*r)

console.log('A='+area.toFixed(4))