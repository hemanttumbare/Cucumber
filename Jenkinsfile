@Library('demolib') _

pipeline {
    agent any
    //parameters {
      //  choice(name: 'Tags', choices: ['demo', 'demo1', 'demo2', 'test'], description: 'Choose Tag')
   // }
    stages {
        stage("Build"){
            steps{
                git branch: 'master', credentialsId: 'b766ee9d-56d7-439d-a519-9f75f02e054f', url: 'https://github.com/hemanttumbare/Cucumber.git'
            }
        }
        stage("BDD"){
          
                     steps{
                            script{
                              //  if (fileExists('src/test/resources/FeatureFiles/Test.feature')) {
                              //      echo "File src/test/rersources/FeatureFiles/Test.feature found!"
                              //      def str = readFile 'src/test/resources/FeatureFiles/Test.feature'
                             //       println(str)
                              //       }
                                        def listOfTags = [] as Set
                                      
                                        def files = findFiles(glob: 'src/test/resources/FeatureFiles/*.feature')
                                        println "${files}"
                                        files.each { 
                                                def str1 = readFile "${it}"
                                                // println(str1)
                                                 listOfTags.addAll(extractTags.readFileLineByLine(str1))
                                        }
                                       // println listOfTags
                                       def releaseScopeChoices = ''
                                         listOfTags.each {
                                                  releaseScopeChoices += it + '\n'
                                                            }
                                        properties([parameters([choice(choices: "${releaseScopeChoices}", description: 'Chose the tag ',name: 'Tags')])])
                                 }
                                  bat "mvn clean install -Dcucumber.filter.tags=${params.Tags}"
                                }
                   }
                stage("Report"){
                            steps{
                                 allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
                                }
                        }
            }
}
