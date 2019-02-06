node {

   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/GeorgiDimitrov19/sampleApplication'

   }
   stage('Build') {
sh label: '', returnStdout: true, script: 'ansible-playbook -u vagrant /var/lib/jenkins/workspace/freestyle_project/download-war.yml'
   }

}