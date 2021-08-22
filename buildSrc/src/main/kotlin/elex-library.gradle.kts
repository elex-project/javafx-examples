import gradle.kotlin.dsl.accessors._496219b122f87f8abbd64d1094d3f5b6.jar

plugins {
	id ("elex-base")
	`java-library`
	`maven-publish`
}
tasks.jar {
	manifest { // todo
		attributes(mapOf(
			"Implementation-Title" to project.name,
			"Implementation-Version" to project.version,
			"Implementation-Vendor" to "ELEX co.,pte.",
			"Automatic-Module-Name" to "com.elex_project.${project.name}"
		))
	}
}
publishing {
	publications {
		create<MavenPublication>("mavenJava") {
			from(components["java"])
			pom {
				// todo
				name.set("${rootProject.name} ${project.name}")
				description.set(project.description)
				url.set("https://www.elex-project.com/")
				inceptionYear.set("2021")
				properties.set(mapOf(
					"myProp" to "value",
					"prop.with.dots" to "anotherValue"
				))
				organization {
					name.set("Elex co.,Pte.")
					url.set("https://www.elex-project.com/")
				}
				licenses {
					license {
						// todo
						name.set("Apache License 2.0")
						url.set("https://github.com/elex-project/${rootProject.name}/blob/main/LICENSE")
						comments.set("")
					}
				}
				developers {
					developer {
						id.set("elex")
						name.set("Elex")
						url.set("https://www.elex.pe.kr/")
						email.set("developer@elex-project.com")
						organization.set("Elex Co.,Pte.")
						organizationUrl.set("https://www.elex-project.com/")
						roles.set(arrayListOf("Developer", "CEO"))
						timezone.set("Asia/Seoul")
						properties.set(mapOf("" to ""))
					}
				}
				contributors {
					contributor {
						name.set("")
						email.set("")
						url.set("")
					}
				}
				scm {
					// todo
					connection.set("scm:git:https://github.com/elex-project/${rootProject.name}.git")
					developerConnection.set("scm:git:https://github.com/elex-project/${rootProject.name}.git")
					url.set("https://github.com/elex-project/${rootProject.name}/")
				}
			}
		}
	}

	repositories {
		maven {
			name = "mavenElex"
			val urlRelease = uri("https://repository.elex-project.com/repository/maven-releases")
			val urlSnapshot = uri("https://repository.elex-project.com/repository/maven-snapshots")
			url = if (version.toString().endsWith("SNAPSHOT")) urlSnapshot else urlRelease
			// Repository credential, Must be defined in ~/.gradle/gradle.properties
			credentials {
				username = project.findProperty("repo.username") as String
				password = project.findProperty("repo.password") as String
			}
		}
		maven { //todo
			name = "mavenGithub"
			url = uri("https://maven.pkg.github.com/elex-project/${rootProject.name}")
			credentials {
				username = project.findProperty("github.username") as String
				password = project.findProperty("github.token") as String
			}
		}
	}
}

dependencies {

}
