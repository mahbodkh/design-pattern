package app.behavioral.iterator;

/*
 * created by Mahbod Kh with ❤️.
 */


public interface ChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    ChannelIterator iterator(ChannelTypeEnum type);

}