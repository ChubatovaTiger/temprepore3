import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

version = "2022.10"

project {
    for (i in 0..3) {
        subProject {
            id("Proj$i")
            name = "Proj$i"
            val rootid="Proj$i_Root$i"
            vcsRoot(rootid)
                buildType {
                    id("Build$i")
                    name = "Build$i"
                    
                    vcs { root(rootid)
                        
                        }
            }
        }
    }
}


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

object Proj1_Root1 : GitVcsRoot({
    name = "root1"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/12e"
    branchSpec = "refs/heads/(*)"
})
object Proj2_Root2 : GitVcsRoot({
    name = "root2"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/12e"
    branchSpec = "refs/heads/(*)"
})
object Proj3_Root3 : GitVcsRoot({
    name = "root3"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/12e"
    branchSpec = "refs/heads/(*)"
})
