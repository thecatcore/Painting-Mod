var fs = require("fs")
var path = require("path")

var blockstatepath = "./src/main/resources/assets/paintingmod/blockstates"
var itemmodelpath = "./src/main/resources/assets/paintingmod/models/item"
var blockmodelpath = "./src/main/resources/assets/paintingmod/models/block"

var blocks = require("./blocks.json")
var colors = ["black","red","green","brown","blue","purple","cyan","light_gray","gray","pink","lime","yellow","light_blue","magenta","orange","white"]
var test = "\n"
for (var i = 0; blocks.length > i ; i++) {
    console.log("\n#" + btouppercase(blocks[i]) + " Blocks");
    if(!test == "\n") {
        test = test + "\n \n#" + btouppercase(blocks[i]) + " Blocks";
    } else {
        test = test + " \n#" + btouppercase(blocks[i]) + " Blocks";
    }
    for (var a = 0; colors.length > a ; a++) {
        var upcolor = ctouppcase(colors[a])
        var upblock = btouppercase(blocks[i])
        test = test + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + ".name=" + upcolor + " " + upblock;
        console.log("The line : " + "\ntile.paintingmod." + colors[a] + "_" + blocks[i] + ".name=" + upcolor + " " + upblock + "\nhas been added to the localization file");

        var blockstate = {}
        blockstate.variants = {}
        blockstate.variants[""] = { model: "paintingmod:block/" + colors[a] + "_" + blocks[i] }
        fs.writeFile(path.join(blockstatepath, colors[a] + "_" + blocks[i] + ".json"), JSON.stringify(blockstate), (err) => {
            if (err) {
                console.log(err)
            }
        })

        var blockmodel = {
            parent: "block/cube_all",
            textures: {
                all: "paintingmod:blocks/" + colors[a] + "_" + blocks[i]
                .replace("oak_","")
                .replace("spruce_","")
                .replace("birch_","")
                .replace("jungle_","")
                .replace("acacia_","")
                .replace("dark_", "")
                .replace("red_nether_brick","nether_brick")
                .replace("red_sand", "sand")
            }
        }
        fs.writeFile(path.join(blockmodelpath, colors[a] + "_" + blocks[i] + ".json"), JSON.stringify(blockmodel), (err) => {
            if (err) {
                console.log(err)
            }
        })
        var itemmodel = {
            parent: "paintingmod:block/" + colors[a] + "_" + blocks[i]
        }
        fs.writeFile(path.join(itemmodelpath, colors[a] + "_" + blocks[i] + ".json"), JSON.stringify(itemmodel), (err) => {
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