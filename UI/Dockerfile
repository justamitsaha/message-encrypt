FROM nginx:1.20.0
RUN rm /etc/nginx/conf.d/default.conf
RUN chmod -R 777 /usr/share/nginx/html
COPY /content /usr/share/nginx/html
RUN chmod -R 777 /usr/share/nginx/html/docroot
COPY index.html /usr/share/nginx/html
COPY conf /etc/nginx
VOLUME /usr/share/nginx/html

CMD ["nginx", "-g", "daemon off;"]

#docker build . -t custom_nginx_img
#docker  run -d --name webapp -p 80:80 custom_nginx_img
#docker  run --name webapp -p 80:80 custom_nginx_img
#docker run -i --volumes-from webapp --name mynginx4_files debian /bin/bash