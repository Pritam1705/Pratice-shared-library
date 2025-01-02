def checkout() {
   // Ensure that 'org' is properly defined and accessible here
    def repoUrl = 'https://github.com/Siddharth2419/CICD.git'
    def branch = 'main'
    // Perform git checkout
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[url: repoUrl]]
    ])
}
