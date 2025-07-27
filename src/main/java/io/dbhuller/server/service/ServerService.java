package io.dbhuller.server.service;

import io.dbhuller.server.model.Server;

import java.util.Collection;

public interface ServerService {

    Server createServer(Server server);
    Server pingServer(String ipAddress);
    Collection<Server> serverList(int limit);
    Server getServer(Long id);
    Server updateServer(Server server);
    Boolean deleteServer(Long id);

}
