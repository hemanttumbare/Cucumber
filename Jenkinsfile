pipeline {
    agent any
    parameters {
        choice(name: 'Tags', choices: ['test', 'test1', 'test2'], description: 'Choose Tag')
    }
    stages {
        stage("Git Clone"){
            steps{
                git branch: 'master', credentialsId: 'b766ee9d-56d7-439d-a519-9f75f02e054f', url: 'https://github.com/hemanttumbare/Cucumber.git'
            }
        }
        stage("Build"){
            steps{
               bat "mvn clean install -Dcucumber.filter.tags=@${params.Tags}"
            }
        }
        stage("Parallel"){
       
        parallel {
            stage("one"){
                steps{
                    bat "mvn -v"
                }
            }
            stage("two"){
               steps{
                    bat "mvn -v"
                }
            }
        }
    }
    }
}
