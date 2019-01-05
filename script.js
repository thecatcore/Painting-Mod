const fs = require("fs")
const path = require('path')

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./blocks.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
for (var i = 0; blocks.length > i; i++) {
    for (var a = 0; colors.length > a; a++) {
        var blockstate = {
            variants: {}
        }
        blockstate.variants["facing=east,half=bottom,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs"}
        blockstate.variants["facing=west,half=bottom,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer"}
        blockstate.variants["facing=west,half=bottom,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 270, uvlock: true}
        blockstate.variants["facing=west,half=bottom,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 90, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer"}
        blockstate.variants["facing=north,half=bottom,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", y: 180, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner"}
        blockstate.variants["facing=west,half=bottom,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 180, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 90, uvlock: true}
        blockstate.variants["facing=north,half=bottom,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 270, uvlock: true}
        blockstate.variants["facing=east,half=bottom,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 270, uvlock: true}
        blockstate.variants["facing=west,half=bottom,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 90, uvlock: true}
        blockstate.variants["facing=south,half=bottom,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner"}
        blockstate.variants["facing=north,half=bottom,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", y: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=straight"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=outer_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=outer_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_outer", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 270, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=inner_right"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, uvlock: true}
        blockstate.variants["facing=east,half=top,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, uvlock: true}
        blockstate.variants["facing=west,half=top,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 180, uvlock: true}
        blockstate.variants["facing=south,half=top,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 90, uvlock: true}
        blockstate.variants["facing=north,half=top,shape=inner_left"] = {model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_stairs_inner", x: 180, y: 270, uvlock: true}
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
                bottom: "paintingmod:blocks/" + colors[a] + "_" + blocks[i],
                top: "paintingmod:blocks/" + colors[a] + "_" + blocks[i],
                side: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
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