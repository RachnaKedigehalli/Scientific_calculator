pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage('Git pull') {
            steps {
                git url: 'https://github.com/RachnaKedigehalli/Scientific_calculator.git',
                branch: 'main',
                credentialsId: 'mini_project_github_cred'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build docker image and publish to dockerhub') {
            steps {
                sh 'docker build -t rachnask/scientific_calculator:latest .'
                withDockerRegistry([credentialsId: 'mini_project_dockerhub_cred']) {
                    sh 'docker push rachnask/scientific_calculator:latest'
                }
            }
        }
    }
}