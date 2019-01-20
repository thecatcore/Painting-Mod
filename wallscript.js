var fs = require("fs")
var path = require("path")
var walls = require("./walls.json")
var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates".replace("paintingmod", walls.modid)
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item".replace("paintingmod", walls.modid)
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"


var blocks = walls.blocks
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i ; i++) {
    console.log("\n#" + btouppercase(blocks[i]) + " Walls");
    if(!test == "\n") {
        test = test + "\n \n#" + btouppercase(blocks[i]) + " Walls";
    } else {
        test = test + " \n#" + btouppercase(blocks[i]) + " Walls";
    }
    for (var a = 0; colors.length > a ; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod.".replace("paintingmod", walls.modid) + colors[a] + "_" + blocks[i] + "_wall.name=" + upcolor + " " + upblock + " Wall";
        console.log("The line : " + "\ntile.paintingmod.".replace("paintingmod", walls.modid) + colors[a] + "_" + blocks[i] + "_wall.name=" + upcolor + " " + upblock + " Wall" + "\nhas been added to the localization file");

        var blockstate = {
            multipart: [
                { when: { up: true},
                    apply: { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_post"}},
                { when: { north: true},
                    apply: { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_side", uvlock: true}
                },
                { when: { east: true},
                    apply: { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_side", y: 90, uvlock: true}
                },
                { when: { south: true},
                    apply: { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_side", y: 180, uvlock: true}
                },
                { when: { west: true},
                    apply: { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_side", y: 270, uvlock: true}
                }
            ]
        }
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + "_wall.json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodelpost = {
            parent: "block/template_wall_post",
            textures: {
                wall: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("mossy_cobblestone","moss_stone")
                .replace("red_","")
                .replace("purpur", "purpur_block")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_wall_post.json"), JSON.stringify(blockmodelpost), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelside = {
            parent: "block/template_wall_side",
            textures: blockmodelpost.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_wall_side.json"), JSON.stringify(blockmodelside), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelinventory = {
            parent: "block/wall_inventory",
            textures: blockmodelpost.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_wall_inventory.json"), JSON.stringify(blockmodelinventory), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var itemmodel = {
            parent: "paintingmod:block/" + colors[a] + "_" + blocks[i] + "_wall_inventory"
        }
        fs.writeFile(path.join(itemmodelpath, colors[a] + "_" + blocks[i] + "_wall.json"), JSON.stringify(itemmodel), (err) => {
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