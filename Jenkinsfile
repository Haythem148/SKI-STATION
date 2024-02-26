pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                echo "Hello World!!!!"
            }
        }
        stage('Build') {
            steps {
                echo "Pulling ...."
                git branch: "main", url: 'https://github.com/Haythem148/SKI-STATION.git'
            }
        }
        stage('Test') {
            steps {
                echo "Working ...."
                // Add your testing steps here
            }
        }
        stage('Testing Maven') {
            steps {
                sh "mvn -version"
            }
        }
    }
}

