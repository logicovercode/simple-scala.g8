val build = SBuild("your-organization", "your-project", "0.0.1")
  .scalaVersions(scala_2_13_MaxVersion)
  .sourceDirectories("app")
  .testSourceDirectories("app-spec")
  .testDependencies( scalatest() )

val yourProject = ( project in file(".") ).settings( build.settings )