package io.dbhuller.server.service.implementation;

import io.dbhuller.server.model.Server;
import io.dbhuller.server.service.ServerService;

import java.util.Collection;

public class ServerServiceImpl implements ServerService {
    @Override
    public Server createServer(Server server) {
        return null;
    }

    @Override
    public Server pingServer(String ipAddress) {
        return null;
    }

    @Override
    public Collection<Server> serverList(int limit) {
        return null;
    }

    @Override
    public Server getServer(Long id) {
        return null;
    }

    @Override
    public Server updateServer(Server server) {
        return null;
    }

    @Override
    public Boolean deleteServer(Long id) {
        return null;
    }
}
