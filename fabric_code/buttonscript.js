var fs = require("fs")
var path = require("path")

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./buttons.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i ; i++) {
    console.log("\n#" + btouppercase(blocks[i]) + " Buttons");
    if(!test == "\n") {
        test = test + "\n \n#" + btouppercase(blocks[i]) + " Buttons";
    } else {
        test = test + " \n#" + btouppercase(blocks[i]) + " Buttons";
    }
    for (var a = 0; colors.length > a ; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_button.name=" + upcolor + " " + upblock + " Button";
        console.log("The line : " + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_button.name=" + upcolor + " " + upblock + " Button" + "\nhas been added to the localization file");

        var blockstate = {}
        blockstate.variants = {}
        blockstate.variants["face=floor,facing=east,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 90 }
        blockstate.variants["face=floor,facing=west,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 270 }
        blockstate.variants["face=floor,facing=south,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 180 }
        blockstate.variants["face=floor,facing=north,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button"}
        blockstate.variants["face=wall,facing=east,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", uvlock: true, x: 90, y: 90 }
        blockstate.variants["face=wall,facing=west,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", uvlock: true, x: 90, y: 270 }
        blockstate.variants["face=wall,facing=south,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", uvlock: true, x: 90,y: 180 }
        blockstate.variants["face=wall,facing=north,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", uvlock: true, x: 90}
        blockstate.variants["face=ceiling,facing=east,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 270, x: 180 }
        blockstate.variants["face=ceiling,facing=west,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 90, x: 180 }
        blockstate.variants["face=ceiling,facing=south,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", x: 180 }
        blockstate.variants["face=ceiling,facing=north,powered=false"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button", y: 180, x: 180 }

        blockstate.variants["face=floor,facing=east,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 90 }
        blockstate.variants["face=floor,facing=west,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 270 }
        blockstate.variants["face=floor,facing=south,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 180 }
        blockstate.variants["face=floor,facing=north,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed"}
        blockstate.variants["face=wall,facing=east,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", uvlock: true, x: 90, y: 90 }
        blockstate.variants["face=wall,facing=west,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", uvlock: true, x: 90, y: 270 }
        blockstate.variants["face=wall,facing=south,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", uvlock: true, x: 90,y: 180 }
        blockstate.variants["face=wall,facing=north,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", uvlock: true, x: 90}
        blockstate.variants["face=ceiling,facing=east,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 270, x: 180 }
        blockstate.variants["face=ceiling,facing=west,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 90, x: 180 }
        blockstate.variants["face=ceiling,facing=south,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", x: 180 }
        blockstate.variants["face=ceiling,facing=north,powered=true"] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_pressed", y: 180, x: 180 }
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + "_button.json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodel = {
            parent: "block/button",
            textures: {
                texture: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_", "")
                .replace("light_weighted","gold_block")
                .replace("heavy_weighted","iron_block")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_button.json"), JSON.stringify(blockmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelpressed = {
            parent: "block/button_pressed",
            textures: blockmodel.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_button_pressed.json"), JSON.stringify(blockmodelpressed), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelinventory = {
            parent: "block/button_inventory",
            textures: blockmodel.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_button_inventory.json"), JSON.stringify(blockmodelinventory), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var itemmodel = {
            parent: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_button_inventory"
        }
        fs.writeFile(path.join(itemmodelpath, colors[a] + "_" + blocks[i] + "_button.json"), JSON.stringify(itemmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })
    }
}
var langfile = langfile + test;
fs.writeFile("./dev.lang", langfile, (err) => {
   if (err) throw err;
})

function ctouppcase(string) {
    var wordlist = string.split("_")
    var dddd = ""
    for (var z = 0; wordlist.length > z; z++) {
        if (z===0) {
            dddd = wordtouppercase(wordlist[0])
        } else {
            dddd = dddd + " " + wordtouppercase(wordlist[z])
        }
    }
    return dddd
}

function btouppercase(string) {
    var wordlist = string.split("_")
    var dddd = ""
    for (var z = 0; wordlist.length > z; z++) {
        if (z===0) {
            dddd = wordtouppercase(wordlist[0])
        } else {
            dddd = dddd + " " + wordtouppercase(wordlist[z])
        }
    }
    return dddd
}

function wordtouppercase(string) {
    var fletter = string.substring(0,1)
    var rest = string.substr(1)
    return fletter.toUpperCase() + rest
}