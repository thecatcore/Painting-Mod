const fs = require("fs")
const path = require('path')

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./slabs.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i; i++) {
    console.log("\n##" + btouppercase(blocks[i]) + " Slabs");
    if(!test == "\n") {
        test = test + "\n \n##" + btouppercase(blocks[i]) + " Slabs";
    } else {
        test = test + " \n##" + btouppercase(blocks[i]) + " Slabs";
    }
    for (var a = 0; colors.length > a; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_slab.name=" + upcolor + " " + upblock + " Slab";
        console.log("The line : " + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_slab.name=" + upcolor + " " + upblock + " Slab" + "\nhas been added to the localization file");
        var blockstate = {
            variants: {}
        }
        blockstate.variants["type=double,waterlogged=false"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i]
                .replace("dark_oak_", "")
                .replace("oak_", "")
                .replace("spruce_", "")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("purpur","purpur_block")
                .replace("mossy_cobblestone","moss_stone")
                .replace("red_nether_brick","nether_brick")}
        blockstate.variants["type=top,waterlogged=false"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_slab_top"}
        blockstate.variants["type=bottom,waterlogged=false"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_slab"}
        blockstate.variants["type=double,waterlogged=true"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i]
                .replace("dark_oak_", "")
                .replace("oak_", "")
                .replace("spruce_", "")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("purpur","purpur_block")
                .replace("mossy_cobblestone","moss_stone")
                .replace("red_nether_brick","nether_brick")}
        blockstate.variants["type=top,waterlogged=true"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_slab_top"}
        blockstate.variants["type=bottom,waterlogged=true"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_slab"}
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + "_slab.json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var itemmodel = {
            parent: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_slab"
        }
        fs.writeFile(path.join(itemmodelpath, colors[a] + "_" + blocks[i] + "_slab.json"), JSON.stringify(itemmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodel = {
            parent: "minecraft:block/slab",
            textures: {
                bottom: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                    .replace("dark_oak_", "")
                    .replace("oak_", "")
                    .replace("spruce_", "")
                    .replace("birch_","")
                    .replace("jungle_","")
                    .replace("acacia_","")
                    .replace("purpur","purpur_block")
                    .replace("mossy_cobblestone","moss_stone")
                    .replace("red_nether_brick","nether_brick"),
                top: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("dark_oak_", "")
                .replace("oak_", "")
                .replace("spruce_", "")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("purpur","purpur_block")
                .replace("mossy_cobblestone","moss_stone")
                .replace("red_nether_brick","nether_brick"),
                side: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("dark_oak_", "")
                .replace("oak_", "")
                .replace("spruce_", "")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("purpur","purpur_block")
                .replace("mossy_cobblestone","moss_stone")
                .replace("red_nether_brick","nether_brick")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_slab.json"), JSON.stringify(blockmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodeltop = {
            parent: "minecraft:block/slab_top",
            textures: blockmodel.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_slab_top.json"), JSON.stringify(blockmodeltop), (err) => {
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