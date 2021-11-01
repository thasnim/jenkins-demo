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
pipelineJob('theme-park-job-docker') {
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
pipelineJob('theme-park-job-docker-aws') {
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