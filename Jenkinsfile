pipeline {
    agent any 
    tools {
            maven "MAVEN_HOME"
        }
        stages{
            stage("Build Maven Project"){
                steps{
                   checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bandenawaz/devops-jenkins-docker-automation.git']]) 
                   sh 'mvn clean install'
                }
            }
            stage("Build Docker Image"){
                steps{
                    script{
                    sh "docker build -t nawaz130987/devops-automation ."
                }
                }
            }
            
            stage("Push Docker Image to Dokerhub"){
                steps{
                    withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                        sh "docker login -u nawaz130987 -p ${dockerhubpwd}"
                        
                        sh "docker push nawaz130987/devops-automation"
}
                }
            }
        }
}