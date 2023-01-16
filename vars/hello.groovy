#!/usr/bin/env groovy

def call(){
  input message:'terraform destroy?',ok:'yes'
                 sh('terraform destroy -auto-approve');
                 }
