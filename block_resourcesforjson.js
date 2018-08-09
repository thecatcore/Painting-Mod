var fs = require("fs");
var blocks = [
    {
        id: "gold_block",
        name: "Gold Block",
        origine: "Blocks.GOLD_BLOCK",
        usemeta: false,
        hardness: "3.0F",
        resistance: "30.0F",
        harvestTool: "pickaxe",
        harvestLevel: 3,
        material: "IRON",
        sound: "METAL"
    },
    {
        id: "iron_block",
        name: "Iron Block",
        origine: "Blocks.IRON_BLOCK",
        usemeta: false,
        hardness: "5.0F",
        resistance: "30.0F",
        harvestTool: "pickaxe",
        harvestLevel: 2,
        material: "IRON",
        sound: "METAL"
    },
    {
        id: "brick",
        name: "Brick",
        origine: "Blocks.BRICK",
        usemeta: false,
        hardness: "2.0F",
        resistance: "30.0F",
        harvestTool: "pickaxe",
        harvestLevel: 1,
        material: "STONE",
        sound: "GROUND"
    },
    {
        id: "moss_stone",
        name: "Moss Stone",
        origine: "Blocks.MOSS_STONE",
        usemeta: false,
        hardness: "2.0F",
        resistance: "30.0F",
        harvestTool: "pickaxe",
        harvestLevel: 1,
        material: "STONE",
        sound: "GROUND"
    }
]
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
var modblocks = fs.readFileSync("./ModBlocks.txt", {encoding:"utf-8", flag:"r"});
var modblocksresult = modblocks;
var paintbrush = fs.readFileSync("./Paintbrush.txt", {encoding:"utf-8", flag:"r"});
var paintbrushresult = paintbrush;
var pathh = `./src/main/resources/assets/paintingmod/lang/en_us.lang`;
var langfile = fs.readFileSync(pathh, {encoding:"utf-8", flag:"r"}, (err) => {
   if (err) throw err;
});
var test = langfile;
for (var a = 0; a < blocks.length; a++) {
console.log("\n//" + blocks[a].name);
test = test + "\n\n//" + blocks[a].name;
fs.writeFile(pathh, test, (err) => {
   if (err) throw err;
});
modblocksresult = modblocksresult + "\n\n//" + blocks[a].name;
fs.writeFile("./ModBlocks.txt", modblocksresult, (err) => {
   if (err) throw err;
});
paintbrushresult = paintbrushresult + "\nnewbloctopaint(player, worldIn, pos, " + blocks[a].origine;
fs.writeFile("./Paintbrush.txt", paintbrushresult, (err) => {
    if (err) throw err;
});
for (var i=0; i<color.length;i++) {
blockstate(i);
console.log("");
blockmodel(i);
console.log("");
itemblockmodel(i);
console.log("");
test = test + "\ntile." + color[i] + "_" + blocks[a].id + ".name=" + Color[i] + " " + blocks[a].name;
fs.writeFile(pathh, test, (err) => {
    if (err) throw err;
});
console.log("La ligne : " + "\ntile." + color[i] + "_" + blocks[a].id + ".name=" + Color[i] + " " + blocks[a].name + "\na été ajoutée avec succès au fichier de langue");
console.log("");
var staticname = color[i].toUpperCase() + "_" + blocks[a].id.toUpperCase();
if (i === 7) {
    modblocksresult = modblocksresult + "\npublic static final Block " + staticname + "= new LightGrayBlock(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel});`;
} else if (i === 12) {
    modblocksresult = modblocksresult + "\npublic static final Block " + staticname + "= new LightBlueBlock(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel});`;
} else {
modblocksresult = modblocksresult + "\npublic static final Block " + staticname + "= new " + Color[i] + "Block(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel});`;
}
fs.writeFile("./ModBlocks.txt", modblocksresult, (err) => {
    if (err) throw err;
});
console.log("La ligne de code : " + "\npublic static final Block " + staticname + "= new " + Color[i] + "Block(" + `"${blocks[a].id}", Material.${blocks[a].material}, SoundType.${blocks[a].sound}, ${blocks[a].hardness}, ${blocks[a].resistance}, "${blocks[a].harvestTool}", ${blocks[a].harvestLevel});` + "\nÀ été générée avec succès !");
console.log("");
console.log("");
paintbrushresult = paintbrushresult + ", ModBlocks." + staticname;
fs.writeFile("./Paintbrush.txt", paintbrushresult, (err) => {
    if (err) throw err;
});
}
if (blocks[a].usemeta === true) {
    paintbrushresult = paintbrushresult + ", " + blocks[a].meta + ");";
    fs.writeFile("./Paintbrush.txt", paintbrushresult, (err) => {
        if (err) throw err;
    });
} else {
    paintbrushresult = paintbrushresult + ");";
    fs.writeFile("./Paintbrush.txt", paintbrushresult, (err) => {
        if (err) throw err;
    });
}
var splited = paintbrushresult.split("\n");
console.log("La ligne de code : \n" + splited[splited.length] + "\nÀ été générée avec succès !");
console.log("");
console.log("");
console.log("");
console.log("");
}

function blockstate (i) {
    var path = `./src/main/resources/assets/paintingmod/blockstates/${color[i]}_${blocks[a].id}.json`;
    console.log(`Création en cours du fichier: ${path}`);
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
    console.log('Le fichier a été sauvegardé!');
}

function blockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/block/${color[i]}_${blocks[a].id}.json`;
    console.log(`Création en cours du fichier: ${path}`);
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: "block/cube_all",
        textures: {
            all: `paintingmod:blocks/${color[i]}_${blocks[a].id}`
        }
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
    });
    console.log('Le fichier a été sauvegardé!');
}
function itemblockmodel (i) {
    var path = `./src/main/resources/assets/paintingmod/models/item/${color[i]}_${blocks[a].id}.json`;
    console.log(`Création en cours du fichier: ${path}`);
    var createStream = fs.createWriteStream(path);
    createStream.end();
    var json = {
        parent: `paintingmod:block/${color[i]}_${blocks[a].id}`
    }
    fs.writeFile(path, JSON.stringify(json), (err) => {
        if (err) throw err;
    });
    console.log('Le fichier a été sauvegardé!');
}