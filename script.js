const fs = require("fs")

var path = "./src/main/resources/assets/paintingmod/blockstates"
var files = fs.readdirSync(path, "utf8")

for(var i = 0; i < files.length; i++) {
    var data = fs.readFileSync(path + "/" + files[i], { encoding:"utf8" })
    var datat = JSON.parse(data)
    console.log(datat)
    if (datat.variants[""] != undefined) {
        var modelstring = datat.variants[""].model
        var modelstringarray = modelstring.split(":")
        var modelstringarray1 = modelstringarray[0] + ":"
        var modelstringarray2 = modelstringarray[1]
        modelstring = modelstringarray1 + "block/" + modelstringarray2
        datat.variants[""].model = modelstring
        fs.writeFile(path + "/" + files[i], JSON.stringify(datat), (err) => {
            if (err) {
                console.log(err)
            }
        })
    }
    // fs.writeFile(path + "/" + files[i], JSON.stringify(datat), (err) => {
    //     if (err) {
    //         console.log(err)
    //     }
    // })
}