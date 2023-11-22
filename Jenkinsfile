pipeline {
    agent { docker { image 'maven:3.9.5-eclipse-temurin-17-alpine' } }
    stages {
        stage('Stage 1') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}