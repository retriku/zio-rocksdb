val zioVersion = "1.0.9"

lazy val root = project
  .in(file("."))
  .settings(
    inThisBuild(
      List(
        name := "zio-rocksdb",
        organization := "com.github.retriku",
        version := "0.0.1",
        scalaVersion := "3.0.1"
      )
    ),
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"               % zioVersion,
      "dev.zio" %% "zio-test"          % zioVersion % Test,
      "dev.zio" %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio" %% "zio-test-junit"    % zioVersion % Test,
      "dev.zio" %% "zio-test-magnolia" % zioVersion % Test
    ),
    testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))
  )
