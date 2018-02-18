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
      stage('Test') {
          steps {
	      sh 'mvn -f mavenproject1/pom.xml test'
              junit '**/target/surefire-reports/TEST-*.xml'
	  }
      }
      stage('Package') {
          steps {
	     sh 'mvn -f mavenproject1/pom.xml package'
	  }
      }
  }
}
