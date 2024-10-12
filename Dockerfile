FROM eclipse-temurin:21

RUN apt update && apt install -y unzip zip
RUN curl -s "https://get.sdkman.io" | bash
RUN bash -c 'source "/root/.sdkman/bin/sdkman-init.sh" && sdk install gradle'

WORKDIR /app
