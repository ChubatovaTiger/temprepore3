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

    subProject(Proj1)
    subProject(Proj2)
    subProject(Proj3)
    subProject(Proj4)
    subProject(Proj5)
    subProject(Proj6)
    subProject(Proj7)
    subProject(Proj8)
    subProject(Proj9)
    subProject(Proj10)
    subProject(Proj11)
    subProject(Proj12)
    subProject(Proj13)
    subProject(Proj14)
    subProject(Proj15)
    
    }


object Proj1 : Project({
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

object Proj1_Root1 : GitVcsRoot({
    name = "root1"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})

//2/////////////////////////////////////////////////////////////////

object Proj2 : Project({
    name = "proj2"

    vcsRoot(Proj2_Root2)

    buildType(Proj2_Build2)
})

object Proj2_Build2 : BuildType({
    name = "build2"

    vcs {
        root(Proj2_Root2)
    }
})

object Proj2_Root2 : GitVcsRoot({
    name = "root2"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})

//3/////////////////////////////////////////////////////////////////

object Proj3 : Project({
    name = "proj3"

    vcsRoot(Proj3_Root3)

    buildType(Proj3_Build3)
})

object Proj3_Build3 : BuildType({
    name = "build3"

    vcs {
        root(Proj3_Root3)
    }
})

object Proj3_Root3 : GitVcsRoot({
    name = "root3"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//4/////////////////////////////////////////////////////////////////

object Proj4 : Project({
    name = "proj4"

    vcsRoot(Proj4_Root4)

    buildType(Proj4_Build4)
})

object Proj4_Build4 : BuildType({
    name = "build4"

    vcs {
        root(Proj4_Root4)
    }
})

object Proj4_Root4 : GitVcsRoot({
    name = "root4"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//5/////////////////////////////////////////////////////////////////

object Proj5 : Project({
    name = "proj5"

    vcsRoot(Proj5_Root5)

    buildType(Proj5_Build5)
})

object Proj5_Build5 : BuildType({
    name = "build5"

    vcs {
        root(Proj5_Root5)
    }
})

object Proj5_Root5 : GitVcsRoot({
    name = "root5"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//6/////////////////////////////////////////////////////////////////

object Proj6 : Project({
    name = "proj6"

    vcsRoot(Proj6_Root6)

    buildType(Proj6_Build6)
})

object Proj6_Build6 : BuildType({
    name = "build6"

    vcs {
        root(Proj6_Root6)
    }
})

object Proj6_Root6 : GitVcsRoot({
    name = "root6"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//7/////////////////////////////////////////////////////////////////

object Proj7 : Project({
    name = "proj7"

    vcsRoot(Proj7_Root7)

    buildType(Proj7_Build7)
})

object Proj7_Build7 : BuildType({
    name = "build7"

    vcs {
        root(Proj7_Root7)
    }
})

object Proj7_Root7 : GitVcsRoot({
    name = "root7"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//8/////////////////////////////////////////////////////////////////

object Proj8 : Project({
    name = "proj8"

    vcsRoot(Proj8_Root8)

    buildType(Proj8_Build8)
})

object Proj8_Build8 : BuildType({
    name = "build8"

    vcs {
        root(Proj8_Root8)
    }
})

object Proj8_Root8 : GitVcsRoot({
    name = "root8"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//9/////////////////////////////////////////////////////////////////

object Proj9 : Project({
    name = "proj9"

    vcsRoot(Proj9_Root9)

    buildType(Proj9_Build9)
})

object Proj9_Build9 : BuildType({
    name = "build9"

    vcs {
        root(Proj9_Root9)
    }
})

object Proj9_Root9 : GitVcsRoot({
    name = "root9"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//10/////////////////////////////////////////////////////////////////

object Proj10 : Project({
    name = "proj10"

    vcsRoot(Proj10_Root10)

    buildType(Proj10_Build10)
})

object Proj10_Build10 : BuildType({
    name = "build10"

    vcs {
        root(Proj10_Root10)
    }
})

object Proj10_Root10 : GitVcsRoot({
    name = "root10"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//11/////////////////////////////////////////////////////////////////

object Proj11 : Project({
    name = "proj11"

    vcsRoot(Proj11_Root11)

    buildType(Proj11_Build11)
})

object Proj11_Build11 : BuildType({
    name = "build11"

    vcs {
        root(Proj11_Root11)
    }
})

object Proj11_Root11 : GitVcsRoot({
    name = "root11"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//12/////////////////////////////////////////////////////////////////

object Proj12 : Project({
    name = "proj12"

    vcsRoot(Proj12_Root12)

    buildType(Proj12_Build12)
})

object Proj12_Build12 : BuildType({
    name = "build12"

    vcs {
        root(Proj12_Root12)
    }
})

object Proj12_Root12 : GitVcsRoot({
    name = "root12"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//13/////////////////////////////////////////////////////////////////

object Proj13 : Project({
    name = "proj13"

    vcsRoot(Proj13_Root13)

    buildType(Proj13_Build13)
})

object Proj13_Build13 : BuildType({
    name = "build13"

    vcs {
        root(Proj13_Root13)
    }
})

object Proj13_Root13 : GitVcsRoot({
    name = "root13"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//14/////////////////////////////////////////////////////////////////

object Proj14 : Project({
    name = "proj14"

    vcsRoot(Proj14_Root14)

    buildType(Proj14_Build14)
})

object Proj14_Build14 : BuildType({
    name = "build14"

    vcs {
        root(Proj14_Root14)
    }
})

object Proj14_Root14 : GitVcsRoot({
    name = "root14"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
//15/////////////////////////////////////////////////////////////////

object Proj15 : Project({
    name = "proj15"

    vcsRoot(Proj15_Root15)

    buildType(Proj15_Build15)
})

object Proj15_Build15 : BuildType({
    name = "build15"

    vcs {
        root(Proj15_Root15)
    }
})

object Proj15_Root15 : GitVcsRoot({
    name = "root15"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(*)"
})
