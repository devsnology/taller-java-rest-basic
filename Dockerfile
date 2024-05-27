FROM gitpod/workspace-full

USER gitpod

# Install SDKMAN! and Java 17
RUN curl -s "https://get.sdkman.io" | bash && \
    bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \ 
    sdk install java 17.0.3-ms && \
    sdk default java 17.0.3-ms"

ENV JAVA_HOME=/home/gitpod/.sdkman/candidates/java/current
ENV PATH=$JAVA_HOME/bin:$PATH
