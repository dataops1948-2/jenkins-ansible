pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                scm
                echo 'Deploying....'
                script{
                // ansiblePlaybook credentialsId: 'private_key', inventory: 'inventories/a/hosts', playbook: 'my_playbook.yml's
                ansiblePlaybook become:true, installation: 'ansible', playbook: 'my_playbook.yml'
                }
                // ansiblePlaybook(credentialsId: 'private_key', inventory: 'inventories/a/hosts', playbook: 'my_playbook.yml')
            }
        }
    }
}