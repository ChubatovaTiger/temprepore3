package _Self

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project

object Project : Project({

    subProject(Proj12.Project)
    subProject(Proj2.Project)
    subProject(Proj1.Project)
    subProject(Proj13.Project)
    subProject(Proj10.Project)
    subProject(Proj4.Project)
    subProject(Proj11.Project)
    subProject(Proj3.Project)
    subProject(Proj9.Project)
    subProject(Proj6.Project)
    subProject(Proj5.Project)
    subProject(Proj8.Project)
    subProject(Proj7.Project)
    subProject(Proj14.Project)
    subProject(Proj15.Project)
})
