addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

addSbtPlugin("bbc.rms" % "speculate" % "1.2.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-aspectj" % "0.10.6")

addSbtPlugin("io.kamon" % "aspectj-runner" % "0.1.4")

resolvers += "BBC Forge Maven Releases" at "https://dev.bbc.co.uk/maven2/releases/"
