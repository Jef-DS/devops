pipeline {
  agent any
  tools {
     maven 'M3'
  }
  stages {
      stage('checkout') {
          steps {
	      git 'https://github.com/Jef-DS/devops.git'
	  }

      }
      stage('Build') {
          steps {
	     sh 'mvn -f mavenproject1/pom.xml clean compile'
	  }
      }

  }
}
