var fs = require("fs")
var path = require("path")

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./fences.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i ; i++) {
    console.log("\n##" + btouppercase(blocks[i]) + " Fences");
    if(!test == "\n") {
        test = test + "\n \n##" + btouppercase(blocks[i]) + " Fences";
    } else {
        test = test + " \n##" + btouppercase(blocks[i]) + " Fences";
    }
    for (var a = 0; colors.length > a ; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_fence.name=" + upcolor + " " + upblock + " Fences";
        console.log("The line : " + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + "_fence.name=" + upcolor + " " + upblock + " Fences" + "\nhas been added to the localization file");

        var blockstate = {
            multipart: [
                { apply: { model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_fence_post"}},
                { when: { north: true},
                    apply: { model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_fence_side", uvlock: false}
                },
                { when: { east: true},
                    apply: { model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_fence_side", y: 90, uvlock: false}
                },
                { when: { south: true},
                    apply: { model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_fence_side", y: 180, uvlock: false}
                },
                { when: { west: true},
                    apply: { model: "paintingmod:" + colors[a] + "_" + blocks[i] + "_fence_side", y: 270, uvlock: false}
                }
            ]
        }
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + "_fence.json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodelpost = {
            parent: "block/fence_post",
            textures: {
                texture: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_", "")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_fence_post.json"), JSON.stringify(blockmodelpost), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var blockmodelside = {
            parent: "block/fence_side",
            textures: blockmodelpost.textures
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + "_fence_side.json"), JSON.stringify(blockmodelside), (err) => {
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