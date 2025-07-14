# RenderTestApp

## Docker

### Build the Docker image
```sh
docker build -t rendertestapp .
```

### Run the Docker container
```sh
docker run -p 8080:8080 rendertestapp
```

The application will be available at http://localhost:8080 