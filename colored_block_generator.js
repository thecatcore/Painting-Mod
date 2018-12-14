var fs = require("fs");
var blocks = JSON.parse(fs.readFileSync('./blocks.json'))
var color = [
    "black",
    "red",
    "green",
    "brown",
    "blue",
    "purple",
    "cyan",
    "light_gray",
    "gray",
    "pink",
    "lime",
    "yellow",
    "light_blue",
    "magenta",
    "orange",
    "white"
]
var Color = [
    "Black",
    "Red",
    "Green",
    "Brown",
    "Blue",
    "Purple",
    "Cyan",
    "Light Gray",
    "Gray",
    "Pink",
    "Lime",
    "Yellow",
    "Light Blue",
    "Magenta",
    "Orange",
    "White"
]
// var modblocks = fs.readFileSync("./ModBlocks.txt", {encoding:"utf-8", flag:"r"});
// var modblocksresult = modblocks;
// var modblocksmeta = fs.readFileSync("./ModBlocksMeta.txt", {encoding:"utf-8", flag:"r"});
// var modblocksmetaresult = modblocksmeta
var pathh = `./src/main/resources/assets/paintingmod/lang/en_us.lang`;
var langfile = fs.readFileSync(pathh, {encoding:"utf-8", flag:"r"}, (err) => {
  if (err) throw err;
});
var test = "\n";
for (var a = 0; a < blocks.length; a++) {
console.log("\n##" + blocks[a].name);
if(!test == "\n") {
    test = test + "\n \n##" + blocks[a].name;
} else {
    test = test + " \n##" + blocks[a].name;
}

// modblocksresult = modblocksresult;
// fs.writeFile("./ModBlocks.txt", modblocksresult, (err) => {
//    if (err) throw err;
// });
// modblocksmetaresult = modblocksmetaresult
// fs.writeFile("./ModBlocksMeta.txt", modblocksmetaresult, (err) => {
//    if (err) throw err;
// });
blockstatemeta();
for (var i=0; i<color.length;i++) {
blockstate(i);
console.log("");
blockmodel(i);
console.log("");
itemblockmodel(i);
console.log("");
test = test + "\ntile.paintingmod." + color[i] + "_" + blocks[a].id + ".name=" + Color[i] + " " + blocks[a].name;
console.log("The line : " + "\ntile.paintingmod." + color[i] + "_" + blocks[a].id + ".name=" + Color[i] + " " + blocks[a].name + "\nhas been added to the localization file");
console.log("");
console.log("");
}

// fs.writeFile("./ModBlocksMeta.txt", modblocksmetaresult, (err) => {
//      if (err) throw err;
//  });
// if (blocks[a].usemeta) {
//     modblocksresult = modblocksresult + "\npublic static final ColoredBlock " + blocks[a].id.toUpperCase() + " = new ColoredBlock(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel}, Blocks.${blocks[a].origine}, true, ${blocks[a].meta});`;
// } else {
//     modblocksresult = modblocksresult + "\npublic static final ColoredBlock " + blocks[a].id.toUpperCase() + " = new ColoredBlock(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel}, Blocks.${blocks[a].origine}, false);`;
// }
// fs.writeFile("./ModBlocks.txt", modblocksresult, (err) => {
//     if (err) throw err;
// });
console.log("The block : \n" + blocks[a].name + "\nHas been generated with success !");
console.log("");
console.log("");
console.log("");
console.log("");
}
langfile = langfile + test;
fs.writeFile(pathh, langfile, (err) => {
   if (err) throw err;
})

function blockstate (i) {
    var path = `./src/main/resources/assets/paintingmod/blockstates/${color[i]}_${blocks[a].id}.json`;
    console.log(`File creation in progress: ${path}`);
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        variants:{
            normal:{
                model:`paintingmod:${color[i]}_${blocks[a].id}`
            }
        }
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
        //console.log('Le fichier a été sauvegardé!');
    });
    console.log('The file has been saved !');
}

function blockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/block/${color[i]}_${blocks[a].id}.json`;
    console.log(`File creation in progress: ${path}`);
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: "block/cube_all",
        textures: {
            all: `paintingmod:blocks/${color[i]}_${blocks[a].id}`
//             all: `paintingmod:blocks/${color[i]}_default_leaves`
        }
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
    });
    console.log('The file has been saved !');
}
function itemblockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/item/${color[i]}_${blocks[a].id}.json`;
    console.log(`File creation in progress: ${path}`);
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: `paintingmod:block/${color[i]}_${blocks[a].id}`
//         parent: `paintingmod:block/${color[i]}_default_leaves`
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
    });
    console.log('The file has been saved !');
}

function blockstatemeta () {
    path = `./src/main/resources/assets/paintingmod/blockstates/${blocks[a].id}.json`;
    console.log(`File creation in progress: ${path}`);
    createStream2 = fs.createWriteStream(path);
    createStream2.end();
    json2 = {
        variants: {}
    }
    for (var z = 0; z < color.length; z++) {
    json2.variants["color=" + color[z]] = {
            model:`paintingmod:${color[z]}_${blocks[a].id}`
        }
    }
    fs.writeFile(path, JSON.stringify(json2), (err) => {
        if (err) throw err;
        //console.log('Le fichier a été sauvegardé!');
    })
    console.log('The file has been saved !');
}