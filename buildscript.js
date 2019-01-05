const fs = require("fs")
const consts = {
    travis_pull_request: process.env.TRAVIS_PULL_REQUEST,
    travis_branch: process.env.TRAVIS_BRANCH
}

fs.writeFile("./buildscriptcmd.bash", texttowrite(), (err) => {
    if (err) {
        console.log(err)
    }
})
function texttowrite() {
    if (consts.travis_pull_request === true) {
        return "./gradlew build"
    } else {
        if (consts.travis_branch === "dev/fabric") {
            return "./gradlew build githubRelease"
        } else if (consts.travis_branch.startsWith("release/")) {
            return "./gradlew build githubRelease curseforge299755"
        } else {
            return "./gradlew build githubRelease"
        }
    }
}
