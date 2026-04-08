pipeline {

	agent any

	stages {
		stage('Build'){
			steps {
				bat 'mvn clean package'
			}
		}

		stage('Docker build'){
			steps {
				bat 'docker build -t webapp .'
			}
		}

		stage('Run'){
			steps {
				bat 'docker rm -f webapp || exit 0'
				bat 'docker run -d -p 8087:8080 --name webapp webapp'
			}
		}
	}
}


		
