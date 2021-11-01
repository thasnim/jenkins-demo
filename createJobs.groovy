pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/thasnim/cloud-demo.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
ipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/thasnim/cloud-demo.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
ipelineJob('theme-park-job-docker-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/thasnim/cloud-demo.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}