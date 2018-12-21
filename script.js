const fs = require("fs")

var path = "./src/main/resources/assets/paintingmod/blockstates"
var files = fs.readdirSync(path, "utf8")

for(var i = 0; i < files.length; i++) {
    var data = fs.readFileSync(path + "/" + files[i], { encoding:"utf8" })
    var datat = JSON.parse(data)
    var modelvalue = datat.variants.normal
    datat.variants = {}
    datat.variants[""] = modelvalue
    console.log(datat)
    // fs.writeFile(path + "/" + files[i], JSON.stringify(datat), (err) => {
    //     if (err) {
    //         console.log(err)
    //     }
    // })
}