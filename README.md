[![Maven Central](https://img.shields.io/maven-central/v/dev.chrisbanes.compose/compose-bom)](https://search.maven.org/search?q=g:dev.chrisbanes.compose) ![Build status](https://github.com/chrisbanes/compose-bom/actions/workflows/publish.yml/badge.svg)

# Compose BOM (alpha edition)

The Android team at Google introduced a BOM (Bills of Materials) to simplify managing Compose dependencies, late in 2022. You can read more about the BOM in the official setup documentation: https://developer.android.com/jetpack/compose/setup#using-the-bom

The official BOM is great for automatically using the latest _stable_ dependencies, but there are times when you may want to depend on the latest _non-stable_ versions instead (alphas, etc). That is where this repository comes in. This repository contains a copy of the official Compose BOM, but with the latest versions of each library.

It is always up to date, through the amazing [Renovate](https://renovatebot.com) app, which updates the dependencies in this repository automatically.

## Using the BOM

### 'Stable'

The 'stable' releases are those which are tagged. I use quotes on 'stable' because you are still using alpha versions underneath, so YMMV.

[![Maven Central](https://img.shields.io/maven-central/v/dev.chrisbanes.compose/compose-bom)](https://search.maven.org/search?q=g:dev.chrisbanes.compose)

``` groovy
repositories {
    mavenCentral()
}

dependencies {
    api(platform("dev.chrisbanes.compose:compose-bom:2023.04.00-beta01.1"))

    // Use whichever Compose artifacts you need without a version number
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.material3:material3")
}
```

### Snapshot

<details>
<summary>We also publish SNAPSHOTs which are deployed on every commit.</summary>
<p>

[![Maven Central](https://img.shields.io/nexus/s/dev.chrisbanes.compose/compose-bom?server=https%3A%2F%2Foss.sonatype.org)](https://oss.sonatype.org/content/repositories/snapshots/dev/chrisbanes/compose/compose-bom/)

``` groovy
repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    api(platform("dev.chrisbanes.compose:compose-bom:2023.04.00-SNAPSHOT"))

    // Use whichever Compose artifacts you need without a version number
    implementation("androidx.compose.foundation:foundation")
    implementation("androidx.compose.material:material")
    implementation("androidx.compose.material3:material3")
}
```
</p>
</details>


## License

```
Copyright 2023 Chris Banes
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
