import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot


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
 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj1_Root1)
             }
                }
        }
    ///////////
})



object Proj1_Root1 : GitVcsRoot({
    name = "root1"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//2/////////////////////////////////////////////////////////////////

object Proj2 : Project({
    name = "proj2"

    vcsRoot(Proj2_Root2)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj2_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj2_Root2)
             }
                }
        }
    ///////////
})



object Proj2_Root2 : GitVcsRoot({
    name = "root2"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})

//3/////////////////////////////////////////////////////////////////

object Proj3 : Project({
    name = "proj3"

    vcsRoot(Proj3_Root3)

  ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj3_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj3_Root3)
             }
                }
        }
    ///////////
})



object Proj3_Root3 : GitVcsRoot({
    name = "root3"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//4/////////////////////////////////////////////////////////////////

object Proj4 : Project({
    name = "proj4"

    vcsRoot(Proj4_Root4)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj4_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj4_Root4)
             }
                }
        }
    ///////////
})



object Proj4_Root4 : GitVcsRoot({
    name = "root4"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//5/////////////////////////////////////////////////////////////////

object Proj5 : Project({
    name = "proj5"

    vcsRoot(Proj5_Root5)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj5_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj5_Root5)
             }
                }
        }
    ///////////
})



object Proj5_Root5 : GitVcsRoot({
    name = "root5"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//6/////////////////////////////////////////////////////////////////

object Proj6 : Project({
    name = "proj6"

    vcsRoot(Proj6_Root6)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj6_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj6_Root6)
             }
                }
        }
    ///////////
})


object Proj6_Root6 : GitVcsRoot({
    name = "root6"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//7/////////////////////////////////////////////////////////////////

object Proj7 : Project({
    name = "proj7"

    vcsRoot(Proj7_Root7)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj7_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj7_Root7)
             }
                }
        }
    ///////////
})



object Proj7_Root7 : GitVcsRoot({
    name = "root7"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//8/////////////////////////////////////////////////////////////////

object Proj8 : Project({
    name = "proj8"

    vcsRoot(Proj8_Root8)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj8_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj8_Root8)
             }
                }
        }
    ///////////
})


object Proj8_Root8 : GitVcsRoot({
    name = "root8"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//9/////////////////////////////////////////////////////////////////

object Proj9 : Project({
    name = "proj9"

    vcsRoot(Proj9_Root9)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj9_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj9_Root9)
             }
                }
        }
    ///////////
})


object Proj9_Root9 : GitVcsRoot({
    name = "root9"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//10/////////////////////////////////////////////////////////////////

object Proj10 : Project({
    name = "proj10"

    vcsRoot(Proj10_Root10)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj10_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj10_Root10)
             }
                }
        }
    ///////////
})


object Proj10_Root10 : GitVcsRoot({
    name = "root10"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//11/////////////////////////////////////////////////////////////////

object Proj11 : Project({
    name = "proj11"

    vcsRoot(Proj11_Root11)
 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj11_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj11_Root11)
             }
                }
        }
    ///////////
})


object Proj11_Root11 : GitVcsRoot({
    name = "root11"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//12/////////////////////////////////////////////////////////////////

object Proj12 : Project({
    name = "proj12"

    vcsRoot(Proj12_Root12)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj12_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj12_Root12)
             }
                }
        }
    ///////////
})


object Proj12_Root12 : GitVcsRoot({
    name = "root12"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//13/////////////////////////////////////////////////////////////////

object Proj13 : Project({
    name = "proj13"

    vcsRoot(Proj13_Root13)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj13_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj13_Root13)
             }
                }
        }
    ///////////
})

object Proj13_Root13 : GitVcsRoot({
    name = "root13"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//14/////////////////////////////////////////////////////////////////

object Proj14 : Project({
    name = "proj14"

    vcsRoot(Proj14_Root14)

 ////////////////////////////   
    for (i in 1..40) {
                buildType {
                    id("Proj14_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj14_Root14)
             }
                }
        }
    ///////////
})

object Proj14_Root14 : GitVcsRoot({
    name = "root14"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
//15/////////////////////////////////////////////////////////////////

object Proj15 : Project({
    name = "proj15"

    vcsRoot(Proj15_Root15)

 ////////////////////////////   
    for (i in 1..100) {
                buildType {
                    id("Proj15_build1$i")
                    name = "build1$i"
                        vcs {
        root(Proj15_Root15)
             }
                }
        }
    ///////////
})


object Proj15_Root15 : GitVcsRoot({
    name = "root15"
    pollInterval = 6
    url = "https://github.com/ChubatovaTiger/manyBranches"
    branch = "refs/heads/br-demo3"
    branchSpec = "refs/heads/(br-demo1*)"
})
