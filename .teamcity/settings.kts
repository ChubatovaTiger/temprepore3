import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2022.10"

project {
    for (i in 0..3) {
        subProject {
            id("Proj$i")
            name = "Proj$i"
            rootid="Proj$i_Root$i"
            vcsRoot(rootid)
                buildType {
                    id("Build$i")
                    name = "Build$i"
                    
                    vcs {
                        
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
