var fs = require("fs");
var blockname = ""
var color = [
    "black",
    "blue",
    "brown",
    "cyan",
    "gray",
    "green",
    "light_blue",
    "light_gray",
    "lime",
    "magenta",
    "orange",
    "pink",
    "purple",
    "red",
    "white",
    "yellow"
]
for (var i=0; i<color.length;i++) {
blockstate(i)
console.log("")
blockmodel(i)
console.log("")
itemblockmodel(i)
console.log("")
console.log("")
}

function blockstate (i) {
    var path = `./src/main/resources/assets/paintingmod/blockstates/${color[i]}_${blockname}.json`
    console.log(`Création en cours du fichier: ${path}`)
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        variants:{
            normal:{
                model:`paintingmod:${color[i]}_${blockname}`
            }
        }
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
        //console.log('Le fichier a été sauvegardé!');
    });
    console.log('Le fichier a été sauvegardé!');
}

function blockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/block/${color[i]}_${blockname}.json`
    console.log(`Création en cours du fichier: ${path}`)
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: "block/cube_all",
        textures: {
            all: `paintingmod:blocks/${color[i]}_${blockname}`
        }
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
        //console.log('Le fichier a été sauvegardé!');
    });
    console.log('Le fichier a été sauvegardé!');
}
function itemblockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/item/${color[i]}_${blockname}.json`
    console.log(`Création en cours du fichier: ${path}`)
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: `paintingmod:block/${color[i]}_${blockname}`
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
        //console.log('Le fichier a été sauvegardé!');
    });
    console.log('Le fichier a été sauvegardé!');
}