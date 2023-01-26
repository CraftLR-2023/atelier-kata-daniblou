FROM gitpod/workspace-full

USER gitpod

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 19.0.1.fx-zulu && \
    sdk default java 19.0.1.fx-zulu"