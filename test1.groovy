node {
   stage('Build') {
     sh label: '',
        returnStdout: true,
        script: 'cd | ansible-playbook -u vagrant ansible_tests/test1.yml'
   }
}
