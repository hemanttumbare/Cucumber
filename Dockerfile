FROM ubuntu
RUN add-apt-repository ppa:openjdk-r/ppa && \
    apt-get update && apt-get install -y openjdk-11-jdk && \
    apt-get install -y ant && \
    apt-get clean; 
RUN apt-get install maven -y;
