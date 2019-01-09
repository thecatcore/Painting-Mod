const fs = require("fs")
const path = require('path')

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./stairs.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i; i++) {
    console.log("\n##" + btouppercase(blocks[i]) + " Stairs");
    if(!test == "\n") {
        test = test + "\n \n##" + btouppercase(blocks[i]) + " Stairs";
    } else {
        test = test + " \n##" + btouppercase(blocks[i]) + " Stairs";
    }
    for (var a = 0; colors.length > a; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_stairs.name=" + upcolor + " " + upblock + " Stairs";
        console.log("The line : " + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_stairs.name=" + upcolor + " " + upblock + " Stairs" + "\nhas been added to the localization file");
        var blockstate = {
            variants: {}
        }
        blockstate.variants["facing=east,half=bottom,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs"}
        blockstate.variants["facing=west,half=bottom,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer"}
        blockstate.variants["facing=west,half=bottom,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 270, uvlock: true}
        blockstate.variants["facing=west,half=bottom,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 90, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer"}
        blockstate.variants["facing=north,half=bottom,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 180, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner"}
        blockstate.variants["facing=west,half=bottom,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 270, uvlock: true}
        blockstate.variants["facing=west,half=bottom,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 90, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner"}
        blockstate.variants["facing=north,half=bottom,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=straight"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=outer_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=outer_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=inner_right"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=inner_left"] = {model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 270, uvlock: true}
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + "_stairs.json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var itemmodel = {
            parent: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs"
        }
        fs.writeFile(path.join(itemmodelpath, colors[a] + "_" + blocks[i] + "_stairs.json"), JSON.stringify(itemmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodel = {
            parent: "minecraft:block/stairs",
            textures: {
                bottom: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_oak_","")
                .replace("dark_", "")
                .replace("purpur","purpur_block"),
                top: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_oak_","")
                .replace("dark_", "")
                .replace("purpur","purpur_block"),
                side: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_oak_","")
                .replace("dark_", "")
                .replace("purpur","purpur_block")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_stairs.json"), JSON.stringify(blockmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelinner = {
            parent: "minecraft:block/inner_stairs",
            textures: blockmodel.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_stairs_inner.json"), JSON.stringify(blockmodelinner), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelouter = {
            parent: "minecraft:block/outer_stairs",
            textures: blockmodel.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_stairs_outer.json"), JSON.stringify(blockmodelouter), (err) => {
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