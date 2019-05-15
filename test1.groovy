node {
   stage('Build') {
     sh label: '',
        returnStdout: true,
        script: 'ansible-playbook -u vagrant /home/vagrant/ansible_tests/test1.yml'
   }
}
