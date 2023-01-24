import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

version = "2022.10"


project {
    for (i in 0..3) {
        subProject {
            id("Proj$i")
            name = "Proj$i"
            val rootid="Proj$i_Root$i"
            //vcsRoot(Proj1_Root1("$i"))
                buildType {
                    id("Build$i")
                    name = "Build$i"
                    
                    //vcs { root(Proj1_Root1("$i"))
                        
                        }
            }
        }
    }
}

class Derived(p: Str) : GitVcsRoot

/*object Proj1 : Project({
    name = "proj1"

    vcsRoot(Proj1_Root1)

    buildType(Proj1_Build1)
})

object Proj1_Build1 : BuildType({
    name = "build1"

    vcs {
        root(Proj1_Root1)
    }
})
*/

object Proj1_Root1 : Derived({
    name = p
    id=p
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/12e"
    branchSpec = "refs/heads/(*)"
})
